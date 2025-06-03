.class public final La0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/a$a;
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v2, La0/a$a;->a:La0/a$a;

    invoke-virtual {v2, v1}, La0/a$a;->a(I)I

    :cond_0
    if-lt v0, v1, :cond_1

    sget-object v2, La0/a$a;->a:La0/a$a;

    const/16 v3, 0x1f

    invoke-virtual {v2, v3}, La0/a$a;->a(I)I

    :cond_1
    if-lt v0, v1, :cond_2

    sget-object v2, La0/a$a;->a:La0/a$a;

    const/16 v3, 0x21

    invoke-virtual {v2, v3}, La0/a$a;->a(I)I

    :cond_2
    if-lt v0, v1, :cond_3

    sget-object v0, La0/a$a;->a:La0/a$a;

    const v1, 0xf4240

    invoke-virtual {v0, v1}, La0/a$a;->a(I)I

    :cond_3
    return-void
.end method

.method public static final a()Z
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x21

    if-ge v0, v3, :cond_2

    const/16 v3, 0x20

    if-lt v0, v3, :cond_3

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v3, "CODENAME"

    invoke-static {v0, v3}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "REL"

    invoke-static {v3, v0}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {v0, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "Tiramisu"

    invoke-virtual {v5, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    return v1
.end method

.class public abstract Ln2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "com.google.android.datatransport.events"

    .line 2
    .line 3
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static c()I
    .locals 1

    .line 1
    sget v0, Ln2/U;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public static d()Ln2/e;
    .locals 1

    .line 1
    sget-object v0, Ln2/e;->a:Ln2/e;

    .line 2
    .line 3
    return-object v0
.end method

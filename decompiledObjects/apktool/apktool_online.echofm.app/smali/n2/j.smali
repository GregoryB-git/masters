.class public final Ln2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln2/j$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ln2/j;
    .locals 1

    .line 1
    invoke-static {}, Ln2/j$a;->a()Ln2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static c()Ln2/e;
    .locals 2

    .line 1
    invoke-static {}, Ln2/f;->d()Ln2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lh2/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ln2/e;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public b()Ln2/e;
    .locals 1

    .line 1
    invoke-static {}, Ln2/j;->c()Ln2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln2/j;->b()Ln2/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

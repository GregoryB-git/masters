.class public final Ly1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/a$b;,
        Ly1/a$a;
    }
.end annotation


# static fields
.field public static final q:Ly1/a$a;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly1/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly1/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly1/a;->q:Ly1/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly1/a;->o:Ljava/lang/String;

    invoke-static {p1}, LO1/P;->c0(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-object p1, p0, Ly1/a;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lx1/a;)V
    .locals 1

    .line 2
    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx1/a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ly1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ly1/a$b;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/a;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/a;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ly1/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ly1/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    sget-object v0, LO1/P;->a:LO1/P;

    .line 8
    .line 9
    check-cast p1, Ly1/a;

    .line 10
    .line 11
    iget-object v0, p1, Ly1/a;->p:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p0, Ly1/a;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v2}, LO1/P;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object p1, p1, Ly1/a;->o:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Ly1/a;->o:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1, v0}, LO1/P;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/a;->p:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    iget-object v1, p0, Ly1/a;->o:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    xor-int/2addr v0, v1

    .line 18
    return v0
.end method

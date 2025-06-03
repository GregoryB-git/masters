.class public final Ly1/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ly1/D;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ly1/D;->o:Ly1/D;

    .line 5
    .line 6
    iput-object v0, p0, Ly1/E;->b:Ly1/D;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ly1/E;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Ly1/D;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/E;->b:Ly1/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly1/E;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public final d(Ly1/D;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ly1/E;->b:Ly1/D;

    .line 7
    .line 8
    return-void
.end method

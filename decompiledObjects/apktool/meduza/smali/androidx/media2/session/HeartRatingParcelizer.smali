.class public final Landroidx/media2/session/HeartRatingParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/session/HeartRating;
    .locals 3

    new-instance v0, Landroidx/media2/session/HeartRating;

    invoke-direct {v0}, Landroidx/media2/session/HeartRating;-><init>()V

    iget-boolean v1, v0, Landroidx/media2/session/HeartRating;->a:Z

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v1}, Lb2/c;->f(IZ)Z

    move-result v1

    iput-boolean v1, v0, Landroidx/media2/session/HeartRating;->a:Z

    iget-boolean v1, v0, Landroidx/media2/session/HeartRating;->b:Z

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1}, Lb2/c;->f(IZ)Z

    move-result p0

    iput-boolean p0, v0, Landroidx/media2/session/HeartRating;->b:Z

    return-object v0
.end method

.method public static write(Landroidx/media2/session/HeartRating;Lb2/c;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Landroidx/media2/session/HeartRating;->a:Z

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lb2/c;->z(IZ)V

    iget-boolean p0, p0, Landroidx/media2/session/HeartRating;->b:Z

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p0}, Lb2/c;->z(IZ)V

    return-void
.end method

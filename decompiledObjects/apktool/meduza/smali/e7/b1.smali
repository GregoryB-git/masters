.class public final Le7/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final synthetic d:Le7/a1;


# direct methods
.method public constructor <init>(Le7/a1;IZZ)V
    .locals 0

    iput-object p1, p0, Le7/b1;->d:Le7/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Le7/b1;->a:I

    iput-boolean p3, p0, Le7/b1;->b:Z

    iput-boolean p4, p0, Le7/b1;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Le7/b1;->d:Le7/a1;

    iget v1, p0, Le7/b1;->a:I

    iget-boolean v2, p0, Le7/b1;->b:Z

    iget-boolean v3, p0, Le7/b1;->c:Z

    move-object v4, p4

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-virtual/range {v0 .. v7}, Le7/a1;->t(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Le7/b1;->d:Le7/a1;

    iget v1, p0, Le7/b1;->a:I

    iget-boolean v2, p0, Le7/b1;->b:Z

    iget-boolean v3, p0, Le7/b1;->c:Z

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-virtual/range {v0 .. v7}, Le7/a1;->t(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Le7/b1;->d:Le7/a1;

    iget v1, p0, Le7/b1;->a:I

    iget-boolean v2, p0, Le7/b1;->b:Z

    iget-boolean v3, p0, Le7/b1;->c:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v7}, Le7/a1;->t(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Le7/b1;->d:Le7/a1;

    iget v1, p0, Le7/b1;->a:I

    iget-boolean v2, p0, Le7/b1;->b:Z

    iget-boolean v3, p0, Le7/b1;->c:Z

    const/4 v7, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v0 .. v7}, Le7/a1;->t(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

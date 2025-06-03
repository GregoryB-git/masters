.class public Lh/a$d;
.super Lh/a$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Lu1/b;


# direct methods
.method public constructor <init>(Lu1/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lh/a$g;-><init>(Lh/a$a;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lh/a$d;->a:Lu1/b;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/a$d;->a:Lu1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu1/b;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/a$d;->a:Lu1/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu1/b;->stop()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

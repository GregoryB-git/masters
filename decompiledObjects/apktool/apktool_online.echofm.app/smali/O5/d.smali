.class public final synthetic LO5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LO5/e;

.field public final synthetic p:Ly5/f;

.field public final synthetic q:Lv5/j;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(LO5/e;Ly5/f;Lv5/j;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO5/d;->o:LO5/e;

    .line 5
    .line 6
    iput-object p2, p0, LO5/d;->p:Ly5/f;

    .line 7
    .line 8
    iput-object p3, p0, LO5/d;->q:Lv5/j;

    .line 9
    .line 10
    iput-wide p4, p0, LO5/d;->r:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LO5/d;->o:LO5/e;

    .line 2
    .line 3
    iget-object v1, p0, LO5/d;->p:Ly5/f;

    .line 4
    .line 5
    iget-object v2, p0, LO5/d;->q:Lv5/j;

    .line 6
    .line 7
    iget-wide v3, p0, LO5/d;->r:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, LO5/e;->a(LO5/e;Ly5/f;Lv5/j;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

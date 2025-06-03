.class public final synthetic Ll2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ll2/c;

.field public final synthetic p:Lf2/p;

.field public final synthetic q:Lc2/h;

.field public final synthetic r:Lf2/i;


# direct methods
.method public synthetic constructor <init>(Ll2/c;Lf2/p;Lc2/h;Lf2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll2/a;->o:Ll2/c;

    .line 5
    .line 6
    iput-object p2, p0, Ll2/a;->p:Lf2/p;

    .line 7
    .line 8
    iput-object p3, p0, Ll2/a;->q:Lc2/h;

    .line 9
    .line 10
    iput-object p4, p0, Ll2/a;->r:Lf2/i;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/a;->o:Ll2/c;

    .line 2
    .line 3
    iget-object v1, p0, Ll2/a;->p:Lf2/p;

    .line 4
    .line 5
    iget-object v2, p0, Ll2/a;->q:Lc2/h;

    .line 6
    .line 7
    iget-object v3, p0, Ll2/a;->r:Lf2/i;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Ll2/c;->c(Ll2/c;Lf2/p;Lc2/h;Lf2/i;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

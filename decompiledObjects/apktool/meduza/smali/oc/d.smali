.class public final Loc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnc/k;

.field public final synthetic b:Loc/f;


# direct methods
.method public constructor <init>(Lnc/l;Loc/f;)V
    .locals 0

    iput-object p1, p0, Loc/d;->a:Lnc/k;

    iput-object p2, p0, Loc/d;->b:Loc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Loc/d;->a:Lnc/k;

    iget-object v1, p0, Loc/d;->b:Loc/f;

    sget-object v2, Lrb/h;->a:Lrb/h;

    invoke-interface {v0, v1, v2}, Lnc/k;->h(Lnc/a0;Lrb/h;)V

    return-void
.end method

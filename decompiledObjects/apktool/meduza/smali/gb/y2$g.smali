.class public final Lgb/y2$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/y2$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2;->p(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lgb/y2$g;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/y2$a0;)V
    .locals 1

    iget-object p1, p1, Lgb/y2$a0;->a:Lgb/s;

    iget-boolean v0, p0, Lgb/y2$g;->a:Z

    invoke-interface {p1, v0}, Lgb/s;->p(Z)V

    return-void
.end method

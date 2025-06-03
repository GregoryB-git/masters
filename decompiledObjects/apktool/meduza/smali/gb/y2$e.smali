.class public final Lgb/y2$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/y2$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2;->o(Leb/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Leb/s;


# direct methods
.method public constructor <init>(Leb/s;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$e;->a:Leb/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/y2$a0;)V
    .locals 1

    iget-object p1, p1, Lgb/y2$a0;->a:Lgb/s;

    iget-object v0, p0, Lgb/y2$e;->a:Leb/s;

    invoke-interface {p1, v0}, Lgb/s;->o(Leb/s;)V

    return-void
.end method

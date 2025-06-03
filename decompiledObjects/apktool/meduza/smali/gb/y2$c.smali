.class public final Lgb/y2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/y2$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/y2;->a(Leb/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Leb/l;


# direct methods
.method public constructor <init>(Leb/l;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$c;->a:Leb/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/y2$a0;)V
    .locals 1

    iget-object p1, p1, Lgb/y2$a0;->a:Lgb/s;

    iget-object v0, p0, Lgb/y2$c;->a:Leb/l;

    invoke-interface {p1, v0}, Lgb/m3;->a(Leb/l;)V

    return-void
.end method

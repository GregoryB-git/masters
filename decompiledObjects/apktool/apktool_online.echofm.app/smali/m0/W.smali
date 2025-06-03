.class public final synthetic Lm0/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRouting$OnRoutingChangedListener;


# instance fields
.field public final synthetic a:Lm0/N$k;


# direct methods
.method public synthetic constructor <init>(Lm0/N$k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/W;->a:Lm0/N$k;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onRoutingChanged(Landroid/media/AudioRouting;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/W;->a:Lm0/N$k;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lm0/N$k;->a(Lm0/N$k;Landroid/media/AudioRouting;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

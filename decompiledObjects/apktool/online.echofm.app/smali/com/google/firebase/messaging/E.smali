.class public final synthetic Lcom/google/firebase/messaging/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/F;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/E;->a:Lcom/google/firebase/messaging/F;

    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/E;->a:Lcom/google/firebase/messaging/F;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/firebase/messaging/F;->a(Lcom/google/firebase/messaging/F;LV2/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

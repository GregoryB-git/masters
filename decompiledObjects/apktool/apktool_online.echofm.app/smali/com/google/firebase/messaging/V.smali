.class public final synthetic Lcom/google/firebase/messaging/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/messaging/W;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/W;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/V;->a:Lcom/google/firebase/messaging/W;

    iput-object p2, p0, Lcom/google/firebase/messaging/V;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/V;->a:Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/messaging/V;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/google/firebase/messaging/W;->a(Lcom/google/firebase/messaging/W;Ljava/lang/String;LV2/j;)LV2/j;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

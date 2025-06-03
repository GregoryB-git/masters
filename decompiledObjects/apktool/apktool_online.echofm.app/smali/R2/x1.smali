.class public final synthetic LR2/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/N1;


# static fields
.field public static final synthetic a:LR2/x1;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR2/x1;

    .line 2
    .line 3
    invoke-direct {v0}, LR2/x1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/x1;->a:LR2/x1;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/u6;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
